# Jibe Minimal Project Template

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

## Getting Started

To use this project template, you currently have to clone and locally publish the jibe project:

1. `git clone git@github.com:scalawag/jibe.git`
2. `cd jibe`
3. `sbt package publish-local`

The example jibe script, in example.scala, requires two vagrant vms in order to run successfully:

1. `cd ..`
2. `git clone git@github.com:scalawag/jibe-template-minimal.git`
3. `cd jibe-template-minimal`
4. `vagrant up`

To run the example script:

`./bin/jibe run example`

To view the results:

`open results/latest/html/index.html`
