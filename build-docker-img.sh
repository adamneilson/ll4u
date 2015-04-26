#!/bin/bash

set -ex

lein uberjar
cp target/ll4u-0.1.0.jar .
docker build -t adamneilson/ll4u .

