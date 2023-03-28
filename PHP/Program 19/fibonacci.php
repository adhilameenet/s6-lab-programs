<html>
    <head>
        <title>Program 19</title>
    </head>
    <body>
        <h2>Fibonacci Numbers</h2>
        <form method="post">
            <input type="number" name="num" placeholder="Enter a Number">
            <button type="submit">Click</button>
        </form>
        <?php
            if($_POST) {
                $num = $_POST['num'];
                $a = 0;
                $b = 1;
                $c = 1;   
                echo $a." ".$b." ";
                while( $c <= $num ) {
                    echo "$c ";
                    $a = $b;
                    $b = $c;
                    $c = $a + $b;
                }
            }
        ?>
    </body>
</html>
