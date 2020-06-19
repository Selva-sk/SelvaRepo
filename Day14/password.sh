#!/bin/bash -x
echo "enter the password"
read password
len="${#password}"

if test $len -ge 8 ; then

    echo "$password" | grep -q [0-9]

     if test $? -eq 0 ; then

           echo "$password" | grep -q [A-Z]

                if test $? -eq 0 ; then

                    echo "$password" | grep -q [a-z]

                       if test $? -eq 0 ; then 

								      count="${password//[^!@#$%^&*()_+]}"
                              echo "${#res}"

                           if [[ ${#count} -eq 1 ]] ; then

                             echo "STRONG PASSWORD.................."

                           else

                             echo "WEAK PASSWORD: special characters should be exactly = 1"

                           fi

                       else

                         echo "WEAK PASSWORD : Include atleast 1 Lower Case Character"

                       fi
                   else

                     echo "WEAK PASSWORD : Include atleast 1 Upper Case character" 

                 fi
          else

       echo "WEAK PASSWORD : Include atleast 1 Number"   

     fi

else

    echo "WEAK PASSWORD : Password Length should be ( >=8 ) "

fi
