<html>
    <head>
        <title>Program 18</title>
    </head>
    <body>
        <form method="post">
            <input type="number" name="num" placeholder="Enter a Number">
            <button type="submit">Check</button>
        </form>
        <?php
            if($_POST) {
                $num = $_POST['num'];
                $sum = 0;
                $temp = $num;
                while ($num > 0) {
                    $rem = $num % 10;
                    $sum = $sum + ( $rem * $rem * $rem );
                    $num = $num / 10;
                }
                if($temp == $sum) {
                    echo "<h3>$temp is a Armstrong Number</h3>";
                } else {
                    echo "<h3>$temp is not a armstrong Number</h3>";
                }
            }
        ?>
    </body>
</html>