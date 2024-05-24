(ns dots.typescript.server.protocol.jsx-emit
  (:require ["typescript" :as typescript]))

(def none (.. typescript/server -protocol -JsxEmit -None))

(def preserve (.. typescript/server -protocol -JsxEmit -Preserve))

(def react-native (.. typescript/server -protocol -JsxEmit -ReactNative))

(def react (.. typescript/server -protocol -JsxEmit -React))
