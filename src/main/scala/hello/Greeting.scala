package hello;

 class Greeting(id:Long, content:String) {

   var id_local:Long=id;
   var content_local:String=content;

    def getId:Long =id_local;

    def getContent:String =content_local;
}