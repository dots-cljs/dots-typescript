(ns dots.typescript.new-line-kind
  (:require ["typescript" :as typescript]))

(def carriage-return-line-feed (.-CarriageReturnLineFeed typescript/NewLineKind))

(def line-feed (.-LineFeed typescript/NewLineKind))
