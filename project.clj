(defproject com.curiosity/clj-aws-s3 "0.5.0"
  :description "Clojure Amazon S3 library (forked from weavejester/clj-aws-s3)"
  :url "https://github.com/CuriosityApp/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.amazonaws/aws-java-sdk "1.11.65"]
                 [clj-time "0.12.2"]]
  :plugins [[lein-codox "0.10.2"]])
