(ns dots.typescript.server.log-level
  (:require ["typescript" :as typescript]))

(def terse (.. typescript/server -LogLevel -terse))

(def normal (.. typescript/server -LogLevel -normal))

(def request-time (.. typescript/server -LogLevel -requestTime))

(def verbose (.. typescript/server -LogLevel -verbose))
