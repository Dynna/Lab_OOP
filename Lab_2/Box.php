<?php

class Box {

    public $height;
    public $width;
    public $length;

    function __construct() {

        $argv = func_get_args();
        switch( func_num_args() ) {
            case 0:
                self::__construct1();
                break;
            case 1:
                self::__construct2($argv[0]);
                break;
            case 3:
                self::__construct3( $argv[0], $argv[1], $argv[2] );
        }
    }

    function __construct1() {
        $this->height = 1;
        $this->width = 1;
        $this->length = 1;

        echo('__construct with 0 params called: '.$this->height.','.$this->width.','.$this->length.PHP_EOL);
    }

    function __construct2($value) {

        $this->height = $value;
        $this->width = $value;
        $this->length = $value;

        echo('__construct with 1 param called: '.$this->height.','.$this->width.','.$this->length.PHP_EOL);
    }

    function __construct3($height, $width, $length) {
        $this->height = $height;
        $this->width = $width;
        $this->length = $length;

        echo('__construct with 3 params called: '.$height.','.$width.','.$length.PHP_EOL);
    }

    public function surfaceArea($length, $width, $height)
    {
        return 2 * ($length * $width + $width * $height + $height * $length);
    }

    public function volumeCalculation($height, $width, $length)
    {
        return $height * $width * $length;
    }
}

$first_box = new Box();
echo "<br>";
$second_box = new Box(7);
echo "<br>";
$third_box = new Box(7, 4, 5);
echo "<br>";
echo "Total surface area of the box is: " .$third_box->surfaceArea(7, 4, 5);
echo "<br>";
echo "Volume of the box is: " .$third_box->volumeCalculation(7, 4, 5);
