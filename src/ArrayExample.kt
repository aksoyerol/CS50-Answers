class ArrayExample {

    companion object {

        fun faktoriyelDizi(dizi: Array<Int>) {

        }

        fun getFactoriel(sayi: Int): Int {
            var sayac = 1
            var factoriel = 1

//            while(sayac<=sayi){
//                factoriel = factoriel*sayac
//                sayac ++
//            }
            if (sayi >= 1) {
                factoriel = sayi * getFactoriel(sayi - 1)
            }
            return 1
        }

        fun jumpTheClouds(c: Array<Int>): Int {
            var jumps = 0
            var index = 0

            while (index < c.size) {

                if (index + 2 < c.size && c[index + 2] == 0) {
                    jumps++
                    index += 2
                } else if (index + 1 < c.size && c[index + 1] == 0) {
                    jumps++
                    index++
                } else {
                    index++
                }
            }
            return jumps
        }

        fun equalizeArray(arr: Array<Int>): Int {
            var current_frequency = 0
            var max_frequency = 1;
            var length = arr.size
            var repeatCount = 0;


            for (i in 0 until length) {
                current_frequency = 0
                for (j in 0 until length - 1) {
                    if (arr[i] == arr[j]) {
                        current_frequency++
                    }

                    if (current_frequency > repeatCount) {
                        repeatCount = current_frequency
                        max_frequency = arr[i]
                    }

                }

            }
            return max_frequency
        }

        fun hackerRankEqualizeArray(arr: Array<Int>): Int {
            var current_frequency = 0
            var max_frequency = 1;
            var length = arr.size
            var repeatCount = 0;

            for (i in 0 until length) {
                current_frequency = 0
                for (j in 0 until length - 1) {
                    if (arr[i] == arr[j]) {
                        current_frequency++
                    }

                    if (current_frequency > repeatCount) {
                        repeatCount = current_frequency
                        max_frequency = arr[i]
                    }

                }

            }
            var cikarilmasiGerekenElamanSayisi = 0;
            for (i in 0 until arr.size) {
                if (arr[i] != max_frequency) {
                    cikarilmasiGerekenElamanSayisi++
                }
            }
            return cikarilmasiGerekenElamanSayisi
        }

        fun cs50xMario(height: Int) {
            for (i in 0 until height) {

                for (j in height downTo i + 1) {
                    print(" ")
                }
                for (k in 0 until i + 1) {
                    print("#")
                }
                println()


            }
        }
        /*
         #
        ##
       ###
      ####
*/

        fun cs50xMarioV2(height: Int) {
            for (i in 0 until height) {

                for (j in height downTo i + 1) {
                    print(" ")
                }
                for (k in 0 until i + 1) {
                    print("#")
                }

                print("  ")

                for (z in 0 until i + 1) {
                    print("#")
                }

                println()

            }
        }

        fun cs50xCreditCart(creditCartNumber: Long) {
            var length: Int = 0
            var stepCreditCartNumber: Long = creditCartNumber

            while (stepCreditCartNumber > 0) {
                stepCreditCartNumber /= 10
                length++
            }
            var originalCreditArray = Array<Int>(length){0}

            if(length!=15 || length!=13 || length!=16) println("Invalid Card")

            var cardNumber = creditCartNumber
            var creditArray = Array<Int>(length){0}

            for (i in 0 until length) {
                creditArray[i] = (cardNumber % 10).toInt()
                originalCreditArray[i] = creditArray[i]
                cardNumber /= 10
            }


            for(item in creditArray){
                print("$item - ")
            }
            println()

            var ikiIlecarpilmisDizi = Array<Int>(length){0}

            for(i in 1 until length step 2){
                creditArray[i] = creditArray[i]*2
                ikiIlecarpilmisDizi[i] = creditArray[i]
            }

            for(item in ikiIlecarpilmisDizi) print("$item - ")

            var rakamToplami=0
            for(i in 0 until ikiIlecarpilmisDizi.size){
                if(ikiIlecarpilmisDizi[i]>=10){
                    rakamToplami+=ikiIlecarpilmisDizi[i]%10
                    ikiIlecarpilmisDizi[i] = ikiIlecarpilmisDizi[i]/10
                }
                rakamToplami+=ikiIlecarpilmisDizi[i]
            }
            println("\n$rakamToplami")

            var ikiyleCarpilmamisDizininToplami : Int = 0
            for(i in 0 until originalCreditArray.size step 2){
                ikiyleCarpilmamisDizininToplami+=originalCreditArray[i]
            }

            var sonuc = ikiyleCarpilmamisDizininToplami + rakamToplami
            if(sonuc%10==0){
            println("\nRakam Toplamları -> $rakamToplami\nİkiyle Çarpılmış Dizinin Rakamları Toplamı -> $ikiyleCarpilmamisDizininToplami")

            if(length==15 && ((originalCreditArray[length-1] == 3 && originalCreditArray[length-2]==4) || (originalCreditArray[length-1]==3) && originalCreditArray[length-2]==7)){
                println("AMEX");
            }
            if(length==16 && originalCreditArray[length-1]==5) println("MASTERCARD")
            if((length==13 || length==16)&&originalCreditArray[length-1]==4) println("VISA")
            println()
            println(originalCreditArray[length-1])

            for(item in originalCreditArray) print("- $item")
            }
        }
    }

}



