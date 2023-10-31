(ns dots.typescript.semicolon-preference
  (:refer-clojure :exclude [remove])
  (:require ["typescript" :as typescript]))

(def ignore (.-Ignore typescript/SemicolonPreference))

(def insert (.-Insert typescript/SemicolonPreference))

(def remove (.-Remove typescript/SemicolonPreference))
