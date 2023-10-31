(ns dots.typescript.signature-kind
  (:require ["typescript" :as typescript]))

(def call (.-Call typescript/SignatureKind))

(def construct (.-Construct typescript/SignatureKind))
