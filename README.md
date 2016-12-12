# clj-aws-s3 (fork)

A Clojure library for accessing Amazon S3, based on the official AWS
Java SDK.

Although there are a few S3 clients for Clojure around, this library
aims to provide a more complete implementation, with metadata, streams
and protocols for uploading different types of data.

Currently the library supports functions to create, list and delete
buckets, to list, get, and put objects and their metadata, and to get
and update the access control lists (ACLs) for buckets and objects.

This is a fork that provides explicit passing of the client object. The
original project is at https://github.com/weavejester/clj-aws-s3. Please
report any bugs to this fork's issue tracker, I assume any bugs are mine.

## Install

Add the following dependency to your `project.clj` file:

    [com.curiosity/clj-aws-s3 "0.5.0"]

## Example

```clojure
(require '[aws.sdk.s3 :as s3])

(def cred {:access-key "...", :secret-key "..."})

(def client (s3/s3-client cred))

(s3/create-bucket client "my-bucket")

(s3/put-object client "my-bucket" "some-key" "some-value")

(s3/update-object-acl client "my-bucket" "some-key" (s3/grant :all-users :read))

(println (slurp (:content (s3/get-object client "my-bucket" "some-key"))))

(map :key (object-seq client "my-bucket" "some/folder/prefix/"))
```

## Documentation

* [API docs](http://curiosity.github.com/clj-aws-s3/)

## License

Copyright © 2014 James Reeves
Copyright © 2015,2016 Beacon Solutions, Inc.

Distributed under the Eclipse Public License, the same as Clojure.
