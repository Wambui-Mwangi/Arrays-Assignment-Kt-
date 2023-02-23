fun main(){
    strings("These", "are", "called", "arrays")
    city()
    numsArr()
    names("I", "am", "Esther")

}
fun strings (s1: String, s2: String, s3: String, s4: String){
   val str = arrayOf(s1, s2, s3, s4)
    println(str.contentToString())
}

fun city() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarda")

    for (cit in cities) {
        val theCities = cit.capitalize()
        println(theCities.capitalize())
    }
}

fun numsArr() {
        var nums = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        val n1 = nums.get(1)
        val n2 = nums.get(4)
        println(n1 + n2)
        println(nums.indexOf(158))
        println(nums.sortedArray().contentToString())
    }

fun names(m1: String, m2: String, m3: String): Array<String> {
        return arrayOf(m1, m2, m3)
    }






