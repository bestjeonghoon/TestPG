
public class MainVerticle extends Verticle {
	public void start() {
		container.logger().info("MainVerticle start");
		vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>(){
			public void handle(HttpServerRequest req){
				req.response().headers().set("Content-Type", "text/plain");
				req.response().end("Hello World");
			}
		}).listen(8080);
	}
}
