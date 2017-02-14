(defproject com.redhat.qe/bugzilla-testng "1.1.2-SNAPSHOT"
  :description "Bugzilla integration for TestNG tests - check if a bz is open before running a test."
  :java-source-path "src"
  :dependencies [[com.redhat.qe/bz-checker "2.0.3-SNAPSHOT"]
                 [com.redhat.qe/jul.test.records "1.0.1"]
                 [org.testng/testng "6.0.1"]
                 [com.redhat.qe/logging-testscript "1.0.2"]]
  :javac-options {:debug "on"}
  :plugins [[lein2-eclipse "2.0.0"]])
