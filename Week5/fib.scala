object fib{
        def show(number:Int) = {
                val list = new Array[Int](number)
                for(i <- 0 to number-1){
                        if(i < 2){
                                list(i) = i
                        }
                        else{
                                list(i) = list(i-1) + list(i-2)
                        }
                }
                list
        }

}
