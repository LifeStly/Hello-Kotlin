package arim
class arim{
    var width:Int = 20
    var height : Int = 40
    var lenght : Int = 100

    var volume : Int
    get() = width * height * lenght / 1000
    set(value) {height = (value * 1000)/(width * lenght)}
}