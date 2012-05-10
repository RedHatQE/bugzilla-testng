(defproject com.redhat.qe/bugzilla-testng "1.0.2"
  :description "Bugzilla integration for TestNG tests - check if a bz is open before running a test."
  :java-source-path "src"
  :dependencies [[com.redhat.qe/bz-checker "1.0.2"]
                 [com.redhat.qe/tcms-testng "1.0.0"]
                 [com.redhat.qe/logging-testscript "1.0.2"]]
  :javac-options {:debug "on"})
