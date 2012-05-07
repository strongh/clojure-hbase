(defproject org.clojars.aperiodic/clojure-hbase "0.92.1-cdh4.0.0b2"
  :description "A convenient Clojure interface to HBase."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.apache.hadoop/hadoop-common "0.23.1-cdh4.0.0b2"]
                 [org.apache.hadoop/hadoop-core "0.23.1-mr1-cdh4.0.0b2"]
                 [org.apache.hbase/hbase "0.92.1-cdh4.0.0b2"]
                 [org.apache.zookeeper/zookeeper "3.3.3"]
                 [log4j/log4j "1.2.16"]
                 [commons-logging/commons-logging "1.0.4"]]
  :repositories {"cdh" ~(str "https://repository.cloudera.com/artifactory/"
                             "cloudera-repos/")})
