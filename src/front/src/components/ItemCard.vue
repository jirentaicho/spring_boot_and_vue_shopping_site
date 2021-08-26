<template>
    <!--自動的にレスポンシブデザインになります-->
    <div class="col">
        <div class="card" style="width: 18rem;">
            <img src="https://pics.prcm.jp/ab4ec1ac077b2/84741053/png/84741053.png">
            <div class="card-body">
                <h5 class="card-title">{{item.name}}</h5>
                <p class="card-text">{{item.price}}円</p>
                <router-link :to='/item/ + item.id'><span class="btn btn-primary">詳細を見る</span></router-link>
            </div>
        </div>
    </div>
</template>

<script>

export default {
    props: {
        item: {
            type: Object,
            require: true,
            'default': () => ({})
        }
    }
}
</script>