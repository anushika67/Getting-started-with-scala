object Palindrome{
 def main(args: Array[String]){
  var word = "anna";
  var tempWord = new StringBuffer(word).reverse().toString();

  if(word.equals(tempWord)){
   println("Palindrome");
  }else{
   println("Not Palindrome");
  }
 }
}

