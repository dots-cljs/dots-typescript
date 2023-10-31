(ns dots.typescript.index-kind
  (:require ["typescript" :as typescript]))

(def string (.-String typescript/IndexKind))

(def number (.-Number typescript/IndexKind))
