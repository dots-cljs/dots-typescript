(ns dots.typescript.script-snapshot
  (:require ["typescript" :as typescript]))

(defn from-string
  ^js [text]
  (.fromString typescript/ScriptSnapshot text))
