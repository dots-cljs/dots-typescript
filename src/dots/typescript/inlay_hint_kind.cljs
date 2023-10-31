(ns dots.typescript.inlay-hint-kind
  (:refer-clojure :exclude [type])
  (:require ["typescript" :as typescript]))

(def type (.-Type typescript/InlayHintKind))

(def parameter (.-Parameter typescript/InlayHintKind))

(def enum (.-Enum typescript/InlayHintKind))
