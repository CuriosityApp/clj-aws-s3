(defproject com.curiosity/clj-aws-s3 "0.5.0"
  :description "Clojure Amazon S3 library (forked from weavejester/clj-aws-s3)"
  :url "https://github.com/CuriosityApp/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [com.amazonaws/aws-java-sdk "1.11.98"]
                 [clj-time "0.13.0"]]
  :plugins [[lein-codox "0.10.3"]])
