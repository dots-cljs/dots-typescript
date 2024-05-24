(ns dots.typescript.server.protocol.indent-style
  (:require ["typescript" :as typescript]))

(def none (.. typescript/server -protocol -IndentStyle -None))

(def block (.. typescript/server -protocol -IndentStyle -Block))

(def smart (.. typescript/server -protocol -IndentStyle -Smart))
