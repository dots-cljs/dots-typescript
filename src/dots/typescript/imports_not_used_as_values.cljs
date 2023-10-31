(ns dots.typescript.imports-not-used-as-values
  (:refer-clojure :exclude [remove])
  (:require ["typescript" :as typescript]))

(def remove (.-Remove typescript/ImportsNotUsedAsValues))

(def preserve (.-Preserve typescript/ImportsNotUsedAsValues))

(def error (.-Error typescript/ImportsNotUsedAsValues))
