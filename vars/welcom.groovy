// def call(name){
//   echo "hey ${name} , how are u"
// }
def call(){
sh """
 mvn clean package
"""
}
