<html>
    <head>
        <title>Program 26</title>
    </head>
    <body>
        <h3>Fruits</h3><hr>
        <form method="post">
            <input type="checkbox" name="fruits[]" value="Banana">Banana <br>
            <input type="checkbox" name="fruits[]" value="Apple">Apple <br>
            <input type="checkbox" name="fruits[]" value="Orange">Orange <br>
            <input type="checkbox" name="fruits[]" value="Mango">Mango <br><br>
            <button type="submit">Submit</button>
        </form>
        <?php
            if($_POST) {
                $fruits = $_POST['fruits'];
                echo "<h3>Selected Fruits Are :</h3>";
                foreach($fruits as $fruit) {
                    echo "<h3>$fruit</h3>";
                }
            }
        ?>
    </body>
</html>