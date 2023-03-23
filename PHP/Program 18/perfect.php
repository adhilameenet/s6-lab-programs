<html>
<head>
    <title>Program 18</title>
</head>
<body>
    <h2>Perfect, Abundant or Deficient</h2>
    <form method="post">
        <input type="number" name="num" placeholder="Enter a Number"/>
        <button type="submit">Check</button>
    </form>
    <?php
        if($_POST) {
            $num = $_POST['num'];
            $sum = 0;
            for ($i = 1; $i < $num; $i++) {
                if( $num % $i == 0 ) {
                    $sum = $sum + $i;
                }
            }
            if ($sum == $num) {
                echo "<h3>Perfect Number</h3>";
            } else if ($sum > $num) {
                echo "<h3>Abundant Number</h3>";
            } else {
                echo "<h3>Deficient Number</h3>";
            }
        }
    ?>
</body>
</html>
