<?php
    $num = 370;
    $sum = 0;
    $temp = $num;
    while ($num > 0) {
        $rem = $num % 10;
        $sum = $sum + ( $rem * $rem * $rem );
        $num = $num / 10;
    }
    if($sum == $temp) {
        echo "The $temp is an Armstrong Number";
    } else {
        echo "The $temp is not an armstrong Number";
    }
?>  