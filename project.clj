(defproject bordeaux "0.1.0-SNAPSHOT"
  :description 
  "A Clojure client for the REDCap API"

  :url 
  "https://github.com/zerokarmaleft/bordeaux"

  :license 
  {:name "MIT License"
   :url  "http://opensource.org/licenses/MIT"}

  :dependencies 
  [[org.clojure/clojure     "1.6.0"]
   [org.clojure/test.check  "0.5.9"]
   [prismatic/schema        "0.2.6"]
   [http-kit                "2.1.16"]
   [cheshire                "5.3.1"]])
