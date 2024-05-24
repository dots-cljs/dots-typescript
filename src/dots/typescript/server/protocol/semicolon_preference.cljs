(ns dots.typescript.server.protocol.semicolon-preference
  (:refer-clojure :exclude [remove])
  (:require ["typescript" :as typescript]))

(def ignore (.. typescript/server -protocol -SemicolonPreference -Ignore))

(def insert (.. typescript/server -protocol -SemicolonPreference -Insert))

(def remove (.. typescript/server -protocol -SemicolonPreference -Remove))
