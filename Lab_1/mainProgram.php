<?php
/**
 * Created by PhpStorm.
 * User: User
 * Date: 9/22/2019
 * Time: 5:55 PM
 */

class University
{
    public $student1_mark;
    public $student2_mark;
    public $student3_mark;

    public function averageMedia($student1_mark, $student2_mark, $student3_mark) {
        $sum = $student1_mark + $student2_mark + $student3_mark;
        $division = 3;
        $result = $sum/$division;

        return $result;
    }
}

$utm = new University();

$usm = new University();

$uesm = new University();

echo "Average media for UTM: " . $utm->averageMedia(9.2, 8.7, 10);
echo "<br>";
echo "Average media for USM: " . $usm->averageMedia(8.5, 6, 7.1);
echo "<br>";
echo "Average media for UESM: " . $uesm->averageMedia(8.1, 9.4, 6);
