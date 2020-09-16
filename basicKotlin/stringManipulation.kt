fun stringManipulation(kataAcak: String, urutanStandar: List<String>): String {

  var kataBenar = String()

  for (value in urutanStandar) {
    if (value.toLowerCase() in kataAcak) {
        kataBenar += "$value "
    }
  }

  return kataBenar;
}

fun main() {
  var kata: String = "cokefriesburgerchickenpizzasandwichonionringsmilkshake"
  var urutan: List<String> = listOf("Burger","Fries","Chicken",
                                    "Pizza","Sandwich","Onionrings",
                                    "Milkshake","Coke")
  var result = stringManipulation(kata, urutan)

  println(result)
}
