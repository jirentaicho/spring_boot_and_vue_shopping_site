(function(t){function e(e){for(var c,i,o=e[0],s=e[1],u=e[2],b=0,d=[];b<o.length;b++)i=o[b],Object.prototype.hasOwnProperty.call(r,i)&&r[i]&&d.push(r[i][0]),r[i]=0;for(c in s)Object.prototype.hasOwnProperty.call(s,c)&&(t[c]=s[c]);l&&l(e);while(d.length)d.shift()();return a.push.apply(a,u||[]),n()}function n(){for(var t,e=0;e<a.length;e++){for(var n=a[e],c=!0,o=1;o<n.length;o++){var s=n[o];0!==r[s]&&(c=!1)}c&&(a.splice(e--,1),t=i(i.s=n[0]))}return t}var c={},r={app:0},a=[];function i(e){if(c[e])return c[e].exports;var n=c[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,i),n.l=!0,n.exports}i.m=t,i.c=c,i.d=function(t,e,n){i.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},i.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},i.t=function(t,e){if(1&e&&(t=i(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(i.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var c in t)i.d(n,c,function(e){return t[e]}.bind(null,c));return n},i.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return i.d(e,"a",e),e},i.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},i.p="/wannai/";var o=window["webpackJsonp"]=window["webpackJsonp"]||[],s=o.push.bind(o);o.push=e,o=o.slice();for(var u=0;u<o.length;u++)e(o[u]);var l=s;a.push([0,"chunk-vendors"]),n()})({0:function(t,e,n){t.exports=n("56d7")},"56d7":function(t,e,n){"use strict";n.r(e);n("e260"),n("e6cf"),n("cca6"),n("a79d");var c=n("7a23"),r={class:"navbar navbar-expand-lg navbar-light bg-light"},a={class:"container-fluid"},i=Object(c["i"])("湾内SHOP"),o={class:"collapse navbar-collapse",id:"navbarNavAltMarkup"},s={class:"navbar-nav"},u=Object(c["i"])("Home"),l=Object(c["i"])("About"),b=Object(c["i"])("Item"),d=Object(c["i"])("カート"),j=Object(c["i"])("Login"),O={class:"container mt-5"};function f(t,e,n,f,m,p){var g=Object(c["x"])("router-link"),h=Object(c["x"])("router-view");return Object(c["s"])(),Object(c["f"])(c["a"],null,[Object(c["g"])("nav",r,[Object(c["g"])("div",a,[Object(c["j"])(g,{to:"/",class:"navbar-brand"},{default:Object(c["D"])((function(){return[i]})),_:1}),Object(c["g"])("div",o,[Object(c["g"])("div",s,[Object(c["j"])(g,{to:"/",class:"nav-link"},{default:Object(c["D"])((function(){return[u]})),_:1}),Object(c["j"])(g,{to:"/about",class:"nav-link"},{default:Object(c["D"])((function(){return[l]})),_:1}),Object(c["j"])(g,{to:"/item",class:"nav-link"},{default:Object(c["D"])((function(){return[b]})),_:1}),p.isLogin?(Object(c["s"])(),Object(c["d"])(g,{key:0,to:"/cart",class:"nav-link"},{default:Object(c["D"])((function(){return[d]})),_:1})):Object(c["e"])("",!0),p.isLogin?(Object(c["s"])(),Object(c["f"])("a",{key:1,class:"nav-link",onClick:e[0]||(e[0]=function(){return p.logout&&p.logout.apply(p,arguments)})},"Logout")):(Object(c["s"])(),Object(c["d"])(g,{key:2,to:"/login",class:"nav-link"},{default:Object(c["D"])((function(){return[j]})),_:1}))])])])]),Object(c["g"])("div",O,[Object(c["j"])(h)])],64)}var m=n("bc3a"),p=n.n(m),g={name:"App",components:{},data:function(){return{hasLoginState:!1}},computed:{isLogin:function(){return!!this.$store.getters.getUserName}},methods:{logout:function(){var t=this;p.a.post("/api/logout").then((function(){alert("ログアウトしました"),t.$store.dispatch("saveUser",""),t.$router.push("/")}))}},mounted:function(){var t=this;p.a.get("/public/getisLogin").then((function(e){e.data||t.$store.dispatch("saveUser","")})).catch((function(t){alert("エラーが発生しました"+t)}))}};n("cea0");g.render=f;var h=g,v=n("6c02"),y=Object(c["g"])("h1",null,"とある湾内さんのショッピングサイト",-1),k=Object(c["i"])(" このサイトはフロントはVue.jsでバックエンドにSpringbootを利用しています。"),w=Object(c["g"])("br",null,null,-1);function x(t,e){var n=Object(c["x"])("P");return Object(c["s"])(),Object(c["f"])("div",null,[y,Object(c["j"])(n,null,{default:Object(c["D"])((function(){return[k,w]})),_:1})])}const C={};C.render=x;var _=C,$=Object(c["i"])(" 当サイトで利用できるユーザー "),L=Object(c["h"])('<table class="table"><thead class="thead-dark"><tr><th scope="col">ロール</th><th scope="col">ユーザー名</th><th scope="col">パスワード</th><th scope="col">備考</th></tr></thead><tbody><tr><td>USER</td><td>misaka</td><td>mikoto</td><td>商品購入するユーザー</td></tr><tr><td>ADMIN</td><td>***</td><td>***</td><td>準備中</td></tr></tbody></table>',1);function U(t,e,n,r,a,i){var o=Object(c["x"])("P");return Object(c["s"])(),Object(c["f"])("div",null,[Object(c["j"])(o,null,{default:Object(c["D"])((function(){return[$]})),_:1}),L])}var D={name:"About"};D.render=U;var S=D,I=Object(c["g"])("h1",null,"ログイン",-1),z={class:"shadow p-3 mt-5 mb-5 bg-white rounded"},A={class:"mb-3"},P=Object(c["g"])("label",{class:"form-label text-start"},"ユーザー名",-1),N={class:"mb-3"},V=Object(c["g"])("label",{class:"form-label"},"パスワード",-1);function E(t,e,n,r,a,i){return Object(c["s"])(),Object(c["f"])("div",null,[I,Object(c["g"])("div",z,[Object(c["g"])("form",null,[Object(c["g"])("div",A,[P,Object(c["E"])(Object(c["g"])("input",{"onUpdate:modelValue":e[0]||(e[0]=function(t){return a.username=t}),type:"text",class:"form-control",id:"username"},null,512),[[c["B"],a.username]])]),Object(c["g"])("div",N,[V,Object(c["E"])(Object(c["g"])("input",{"onUpdate:modelValue":e[1]||(e[1]=function(t){return a.password=t}),type:"password",class:"form-control",id:"password"},null,512),[[c["B"],a.password]])]),Object(c["g"])("button",{type:"button",class:"btn btn-primary",onClick:e[2]||(e[2]=function(){return i.login&&i.login.apply(i,arguments)})},"ログイン")])])])}n("d3b7");var M={name:"Login",data:function(){return{username:"",password:"",isLoginStatus:!1}},methods:{login:function(){var t=this;this.isLoginStatus||(this.isInputValidation()?(this.isLoginStatus=!0,p.a.post("/api/login",{username:this.username,password:this.password}).then((function(e){e&&(t.isLoginStatus=!1),alert("ログインしました"),t.$store.dispatch("saveUser",t.username),t.$router.push("/item")})).catch((function(e){alert("ログインに失敗しました。"+e),t.$router.push("/")})).finally((function(){t.isLoginStatus=!1}))):alert("ユーザー名かパスワードが未入力です。"))},isInputValidation:function(){return!(!this.username||!this.password)}}};M.render=E;var B=M,T=Object(c["g"])("h1",null,"商品一覧",-1),H={class:"row"};function J(t,e,n,r,a,i){var o=Object(c["x"])("ItemCard");return Object(c["s"])(),Object(c["f"])("div",null,[T,Object(c["g"])("div",H,[(Object(c["s"])(!0),Object(c["f"])(c["a"],null,Object(c["w"])(a.items,(function(t){return Object(c["s"])(),Object(c["f"])("div",{key:t.id},[Object(c["j"])(o,{item:t},null,8,["item"])])})),128))])])}n("b0c0");var R={class:"col"},q={class:"card",style:{width:"18rem"}},F=Object(c["g"])("img",{src:"https://pics.prcm.jp/ab4ec1ac077b2/84741053/png/84741053.png"},null,-1),G={class:"card-body"},K={class:"card-title"},Q={class:"card-text"},W=Object(c["g"])("span",{class:"btn btn-primary"},"詳細を見る",-1);function X(t,e,n,r,a,i){var o=Object(c["x"])("router-link");return Object(c["s"])(),Object(c["f"])("div",R,[Object(c["g"])("div",q,[F,Object(c["g"])("div",G,[Object(c["g"])("h5",K,Object(c["z"])(n.item.name),1),Object(c["g"])("p",Q,Object(c["z"])(n.item.price)+"円",1),Object(c["j"])(o,{to:/item/+n.item.id},{default:Object(c["D"])((function(){return[W]})),_:1},8,["to"])])])])}var Y={props:{item:{type:Object,require:!0,default:function(){return{}}}}};Y.render=X;var Z=Y,tt={name:"Item",components:{ItemCard:Z},data:function(){return{items:[]}},methods:{hogeFunc:function(){return!0}},mounted:function(){var t=this;p.a.get("/public/items").then((function(e){t.items=e.data})).catch((function(e){alert("予期せぬエラーが発生しました。"+e),t.$router.push("/")})).finally((function(){}))},computed:{getUserName:function(){return this.$store.getters.getUserName}}};tt.render=J;var et=tt,nt={class:"container mb-5"},ct={class:"row"},rt={class:"col-sm-8"},at={class:"card",style:{width:"90%"}},it=Object(c["g"])("img",{src:"https://pics.prcm.jp/ab4ec1ac077b2/84741053/png/84741053.png",class:"card-img-top",alt:"..."},null,-1),ot={class:"card-body"},st={class:"card-title"},ut={class:"card-text"},lt={class:"list-group list-group-flush"},bt={class:"list-group-item"},dt={class:"list-group-item"},jt={class:"col-sm-4"},Ot={class:"mb-3"},ft=Object(c["g"])("label",{for:"exampleInputEmail1",class:"form-label"},"数量",-1),mt=Object(c["g"])("div",{class:"form-text"},"お一人様99個までとさせていただきます。",-1),pt=Object(c["i"])("合計"),gt=Object(c["i"])("円"),ht=Object(c["g"])("hr",null,null,-1),vt=Object(c["i"])("ログインしてください");function yt(t,e,n,r,a,i){var o=Object(c["x"])("B"),s=Object(c["x"])("router-link");return Object(c["s"])(),Object(c["f"])("div",null,[Object(c["g"])("div",nt,[Object(c["g"])("div",ct,[Object(c["g"])("div",rt,[Object(c["g"])("div",at,[it,Object(c["g"])("div",ot,[Object(c["g"])("h5",st,Object(c["z"])(a.item.name),1),Object(c["g"])("p",ut,Object(c["z"])(a.item.note),1)]),Object(c["g"])("ul",lt,[Object(c["g"])("li",bt,Object(c["z"])(a.item.price)+"円",1),Object(c["g"])("li",dt,"在庫数"+Object(c["z"])(a.item.stock)+"個",1)])])]),Object(c["g"])("div",jt,[Object(c["g"])("form",null,[Object(c["g"])("div",Ot,[Object(c["g"])("h4",null,Object(c["z"])(a.item.name),1),ft,Object(c["E"])(Object(c["g"])("input",{type:"number",class:"form-control",min:"0",max:"99","onUpdate:modelValue":e[0]||(e[0]=function(t){return a.choiceCount=t})},null,512),[[c["B"],a.choiceCount]]),mt]),Object(c["g"])("div",null,[pt,Object(c["j"])(o,null,{default:Object(c["D"])((function(){return[Object(c["i"])(Object(c["z"])(i.getAmt),1)]})),_:1}),gt]),ht,i.isLogin?(Object(c["s"])(),Object(c["f"])("button",{key:0,type:"submit",class:"btn btn-primary",onClick:e[1]||(e[1]=function(){return i.addCart&&i.addCart.apply(i,arguments)})},"カートに入れる")):(Object(c["s"])(),Object(c["d"])(s,{key:1,to:"/login",class:"btn btn-danger"},{default:Object(c["D"])((function(){return[vt]})),_:1}))])])])])])}n("b64b"),n("4d63"),n("ac1f"),n("25f0");var kt={data:function(){return{id:0,choiceCount:0,item:{}}},mounted:function(){var t=this;this.id=this.$route.params.itemId,p.a.get("/public/item/"+this.$route.params.itemId).then((function(e){t.item=e.data})).catch((function(e){alert("予期せぬエラーが発生しました。"+e),t.$router.push("/")})).finally((function(){}))},computed:{getAmt:function(){return Object.keys(this.item).length?this.item.price*this.choiceCount:0},isLogin:function(){return!!this.$store.getters.getUserName}},methods:{addCart:function(){var t=this;this.lenghtValidation()&&this.formatValidation()?p.a.post("/api/addCart",{username:this.$store.getters.getUserName,itemId:this.id,itemName:this.item.name,count:this.choiceCount,amt:this.getAmt}).then((function(){t.$router.push("/")})).catch((function(e){alert("エラーが発生しました"+e),t.$router.push("/")})).finally((function(){})):alert("エラーがあります")},lenghtValidation:function(){return!(this.choiceCount<=0)&&!(this.choiceCount>=100)},formatValidation:function(){var t=new RegExp(/^[0-9]+$/);return t.test(this.choiceCount)}}};kt.render=yt;var wt=kt,xt=Object(c["g"])("h1",null,"ショッピングカート",-1),Ct={class:"container mt-5 mb-5"},_t={key:0},$t={class:"table table-striped"},Lt=Object(c["g"])("thead",null,[Object(c["g"])("tr",null,[Object(c["g"])("th",{scope:"col"},"商品名"),Object(c["g"])("th",{scope:"col"},"数量"),Object(c["g"])("th",{scope:"col"},"値段")])],-1),Ut=Object(c["i"])("合計金額"),Dt=Object(c["i"])("円"),St=Object(c["g"])("hr",null,null,-1),It={key:1},zt=Object(c["g"])("h2",null,"カートは空です。",-1),At=[zt];function Pt(t,e,n,r,a,i){var o=Object(c["x"])("B"),s=Object(c["x"])("P");return Object(c["s"])(),Object(c["f"])("div",null,[xt,Object(c["g"])("div",Ct,[a.orders.length?(Object(c["s"])(),Object(c["f"])("div",_t,[Object(c["i"])(Object(c["z"])(a.orders)+" ",1),Object(c["g"])("table",$t,[Lt,Object(c["g"])("tbody",null,[(Object(c["s"])(!0),Object(c["f"])(c["a"],null,Object(c["w"])(a.orders,(function(t){return Object(c["s"])(),Object(c["f"])("tr",{key:t.id},[Object(c["g"])("td",null,Object(c["z"])(t.itemName),1),Object(c["g"])("td",null,Object(c["z"])(t.count),1),Object(c["g"])("td",null,Object(c["z"])(t.amt),1)])})),128))])]),Object(c["j"])(s,null,{default:Object(c["D"])((function(){return[Ut,Object(c["j"])(o,null,{default:Object(c["D"])((function(){return[Object(c["i"])(Object(c["z"])(i.getTotalAmt),1)]})),_:1}),Dt]})),_:1}),St,Object(c["g"])("button",{type:"button",class:"btn btn-primary",onClick:e[0]||(e[0]=function(){return i.checkout&&i.checkout.apply(i,arguments)})},"注文する")])):(Object(c["s"])(),Object(c["f"])("div",It,At))])])}var Nt={data:function(){return{orders:[]}},mounted:function(){var t=this;p.a.get("/api/getcart").then((function(e){t.orders=e.data})).catch((function(e){alert("予期せぬエラーが発生しました。"+e),t.$router.push("/")})).finally((function(){}))},computed:{getTotalAmt:function(){var t=this.orders.reduce((function(t,e){return t+e.amt}),0);return t}},methods:{checkout:function(){}}};Nt.render=Pt;var Vt=Nt,Et=[{path:"/",name:"Home",component:_},{path:"/about",name:"About",component:S},{path:"/login",name:"Login",component:B},{path:"/item",name:"Item",component:et},{path:"/item/:itemId",name:"ItemDetail",component:wt},{path:"/cart",name:"Cart",component:Vt}],Mt=Object(v["a"])({history:Object(v["b"])("/wannai/"),routes:Et}),Bt=Mt,Tt=(n("f9e3"),n("2dd8"),n("5502")),Ht=n("0e44"),Jt=Object(Tt["a"])({state:{username:""},mutations:{saveUser:function(t,e){t.username=e}},actions:{saveUser:function(t,e){var n=t.commit;n("saveUser",e)}},getters:{getUserName:function(t){return t.username}},plugins:[Object(Ht["a"])({storage:window.sessionStorage})]});Object(c["c"])(h).use(Bt).use(Jt).mount("#app")},5874:function(t,e,n){},cea0:function(t,e,n){"use strict";n("5874")}});
//# sourceMappingURL=app.6bf9596f.js.map