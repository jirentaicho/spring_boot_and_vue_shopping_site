module.exports = {
    devServer: {
        port: 8888,
        proxy: "http://localhost:8080"
    },
    //本番時→あとで修正する
    //publicPath: '/wannai/'
  };