(ns dots.typescript.outer-expression-kinds
  (:require ["typescript" :as typescript]))

(def parentheses (.-Parentheses typescript/OuterExpressionKinds))

(def type-assertions (.-TypeAssertions typescript/OuterExpressionKinds))

(def non-null-assertions (.-NonNullAssertions typescript/OuterExpressionKinds))

(def partially-emitted-expressions (.-PartiallyEmittedExpressions typescript/OuterExpressionKinds))

(def assertions (.-Assertions typescript/OuterExpressionKinds))

(def all (.-All typescript/OuterExpressionKinds))

(def exclude-js-doc-type-assertion (.-ExcludeJSDocTypeAssertion typescript/OuterExpressionKinds))
