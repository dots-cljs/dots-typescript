(ns dots.typescript.server.protocol.new-line-kind
  (:require ["typescript" :as typescript]))

(def crlf (.. typescript/server -protocol -NewLineKind -Crlf))

(def lf (.. typescript/server -protocol -NewLineKind -Lf))
