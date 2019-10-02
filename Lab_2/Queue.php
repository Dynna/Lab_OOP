<?php

class Queue
{
    public $queue;
    public $limit;

    public function __construct($limit = 10)
    {
        $this->queue = array();
        $this->limit = $limit;
    }

    public function push($item) {
        if (count($this->queue) < $this->limit) {
            array_unshift($this->queue, $item);
        }
    }

    public function pop() {
        return array_shift($this->queue);
    }

    public function isEmpty() {
        return empty($this->queue);
    }

    public function isFull() {
        if (count($this->queue) == $this->limit){
            return "The queue is full!";
        }
    }
}

$fruitCollection = new Queue();
$fruitCollection->push('apple');
$fruitCollection->push('banana');
$fruitCollection->push('strawberry');
echo $fruitCollection->pop();

echo "<br>";

$colorCollection = new Queue();
$colorCollection->push('white');
$colorCollection->push('pink');
$colorCollection->push('black');
echo $colorCollection->pop();

if($fruitCollection->isEmpty()){
    array_push($this->queue, "mango", "cherry", "pineapple");
}

if($colorCollection->isFull()){
    $colorCollection->pop();
}

