#!/bin/bash
test `curl -s http://localhost:8081/helloworld/ | grep -c 2014.5` = 1