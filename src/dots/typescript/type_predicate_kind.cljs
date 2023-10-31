(ns dots.typescript.type-predicate-kind
  (:require ["typescript" :as typescript]))

(def this (.-This typescript/TypePredicateKind))

(def identifier (.-Identifier typescript/TypePredicateKind))

(def asserts-this (.-AssertsThis typescript/TypePredicateKind))

(def asserts-identifier (.-AssertsIdentifier typescript/TypePredicateKind))
