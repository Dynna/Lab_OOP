<?php
/**
 * Created by PhpStorm.
 * User: User
 * Date: 9/22/2019
 * Time: 12:02 AM
 */

class Monitor
{
    public $color;
    public $length;
    public $width;
    public $resolution;

};

function compareObjects($first_monitor, $second_monitor)
{
    if($first_monitor != $second_monitor){
        return "The monitors are not the same";
    }
    else {
        return "The monitors have the same characteristics";
    }
}

$first_monitor = new Monitor();
$first_monitor->color = 'gray';
$first_monitor->length = 40;
$first_monitor->width = 5;
$first_monitor->resolution = 'HD';

$second_monitor = new Monitor();
$second_monitor->color = 'black';
$second_monitor->length = 60;
$second_monitor->width = 6;
$second_monitor->resolution = 'HD';

echo compareObjects($first_monitor, $second_monitor);



