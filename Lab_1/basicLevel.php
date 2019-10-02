<?php


function compareMonitors($first_monitor, $second_monitor) {
    if ($first_monitor != $second_monitor) {
        return "The monitors are not the same";
    }
    else {
        return "The monitors have the same characteristics";
    }
};

$first_monitor = (object) [
    'color' => 'gray',
    'length' => 40,
    'width' => 5,
    'resolution' => 'HD'
];

$second_monitor = (object) [
  'color' => 'black',
  'length' => 35,
  'width' => 4,
  'resolution' => 'HD'
];

echo compareMonitors($first_monitor, $second_monitor);


