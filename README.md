# Project Title

In software development, a feature toggle is a mechanism that allows feature to be turned “on” or “off” remotely without the need for a deploy.

## Description

Main goal for the project is to create an example of Unleash setup for feature toggle usage.  We will also create an example for Unleash setup. It is a helpful document on how you can set it up both locally and in a kubernetes cluster.

## Getting Started

### Dependencies

* On local,
  * Docker
* On k8s cluster,
  * Kubernetes Cluster
  * Helm

## Help

This project only shows how to install Unleash in docker and k8s environments. However it has a spring boot configuration class for Unleash. You can configure Unleash in your project by reviewing the code in the project.

I set up the K8s cluster with the help of helm charts in accordance with the gitops approach

In your production environment, it would be more reliable to store the parameters given to Spring boot to configure Unleash using a tool like vault or secrets.


## Authors

Hüseyin Berk Yılmaz

[@Linkedin](https://www.linkedin.com/in/huseyinberk/)
[@X](https://twitter.com/_huseyinberk)
