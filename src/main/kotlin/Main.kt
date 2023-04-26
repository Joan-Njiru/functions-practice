fun main() {
println(intSum(2,4))
    println(intArray(arrayOf(2,4,3,5)))
    println(longestString(arrayOf("Joan","Ian","Fredrick","Ted")))
    println(countVowels("Umbrella"))
    println(reverseString("Joan"))
    println(anagrams("wow","lol"))
    //println(newList(mutableListOf(21,4,6,5,6,7,3)))
    println(secondLargest(mutableListOf(2,4,6,9,8)))
    println(listUppercase(mutableListOf("eggs","samosa")))
    println(concatStrings(mutableListOf("aei","ou")))


}
//Write a function that takes two integers as parameters and returns their sum.
fun intSum(n1:Int,n2:Int):Int{
    return n1+n2
}

//Write a function that takes an array of integers as a parameter and returns
// the sum of all the elements.

fun intArray(numbers:Array<Int>):Int{
    //var total =numbers.sum()
    var singles= arrayOf(numbers)
    var sum=0
    for (n in numbers){
      sum+=n
    }
    return sum
}

//Write a function that takes an array of strings as a parameter and returns the
// length of the longest string.

fun longestString(things:Array<String>):Int{
    var len=0
    for (t in things){
        if (t.length>len)
            len=t.length
        }
    return len
    }


//Write a function that takes a string as a parameter and returns the number of vowels in the string.

fun countVowels(word:String):Int{
    var vowels= arrayOf('a','A','E','e','i','I','o',"O",'u','U')
      var count=0
    for (w in word){
        if (w in vowels){
            count+=1
        }
    }
return count
}

//Write a function that takes a string as a parameter and returns the string in reverse order.

fun reverseString(name:String):String{
    var reverse=name.reversed()
    return reverse
}

//Write a function that takes two strings as parameters and returns true if they are anagrams
// (have the same letters in a different order) and false otherwise.

fun anagrams(str1:String,str2:String):Boolean{
    return str1.reversed()==str1 && str2.reversed()==str2
}

//Write a function that takes a list of integers as a parameter and returns a new list with all
// the even numbers removed.
// fun newList(ints:MutableList<Int>):MutableList<Int>{
//     for (i in ints){
//         if (i%2==0){
//             ints.removeAll(i)
//         }
//     }
//    return ints
// }
fun listUppercase(sent: MutableList<String>): List<String> {
    var new= mutableListOf<String>()
    for (s in sent) {
      var upped=  s.uppercase()
        new.addAll(listOf(upped))
    }
    return new
}
//Write a function that takes a list of strings as a parameter and returns the concatenation of all the strings.
fun concatStrings(str: MutableList<String>): String {
    var concat = ""
    for (s in str) {
        concat += s
    }
    return concat
}



//Write a function that takes a list of integers as a parameter and returns the second largest element in the list.
fun secondLargest(numerals:MutableList<Int>):Int {
    var second=numerals.sortedDescending()
    return second[1]
//Write a function that takes a list of strings as a parameter and returns a new list with all the strings in uppercase.
fun listUppercase(sent: MutableList<String>): List<String> {
        for (s in sent) {
            s.uppercase()
        }
        return sent
    }

    //Write a function that takes a list of strings as a parameter and returns the concatenation of all the strings.
    fun concatStrings(str: MutableList<String>): String {
        var concat = ""
        for (s in str) {
            concat += s
        }
        return concat
    }
}