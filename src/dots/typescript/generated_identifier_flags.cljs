(ns dots.typescript.generated-identifier-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/GeneratedIdentifierFlags))

(def reserved-in-nested-scopes (.-ReservedInNestedScopes typescript/GeneratedIdentifierFlags))

(def optimistic (.-Optimistic typescript/GeneratedIdentifierFlags))

(def file-level (.-FileLevel typescript/GeneratedIdentifierFlags))

(def allow-name-substitution (.-AllowNameSubstitution typescript/GeneratedIdentifierFlags))
