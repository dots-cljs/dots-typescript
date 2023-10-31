(ns dots.typescript.node-flags
  (:refer-clojure :exclude [let namespace])
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/NodeFlags))

(def let (.-Let typescript/NodeFlags))

(def const (.-Const typescript/NodeFlags))

(def using (.-Using typescript/NodeFlags))

(def await-using (.-AwaitUsing typescript/NodeFlags))

(def nested-namespace (.-NestedNamespace typescript/NodeFlags))

(def synthesized (.-Synthesized typescript/NodeFlags))

(def namespace (.-Namespace typescript/NodeFlags))

(def optional-chain (.-OptionalChain typescript/NodeFlags))

(def export-context (.-ExportContext typescript/NodeFlags))

(def contains-this (.-ContainsThis typescript/NodeFlags))

(def has-implicit-return (.-HasImplicitReturn typescript/NodeFlags))

(def has-explicit-return (.-HasExplicitReturn typescript/NodeFlags))

(def global-augmentation (.-GlobalAugmentation typescript/NodeFlags))

(def has-async-functions (.-HasAsyncFunctions typescript/NodeFlags))

(def disallow-in-context (.-DisallowInContext typescript/NodeFlags))

(def yield-context (.-YieldContext typescript/NodeFlags))

(def decorator-context (.-DecoratorContext typescript/NodeFlags))

(def await-context (.-AwaitContext typescript/NodeFlags))

(def disallow-conditional-types-context (.-DisallowConditionalTypesContext typescript/NodeFlags))

(def this-node-has-error (.-ThisNodeHasError typescript/NodeFlags))

(def java-script-file (.-JavaScriptFile typescript/NodeFlags))

(def this-node-or-any-sub-nodes-has-error (.-ThisNodeOrAnySubNodesHasError typescript/NodeFlags))

(def has-aggregated-child-data (.-HasAggregatedChildData typescript/NodeFlags))

(def js-doc (.-JSDoc typescript/NodeFlags))

(def json-file (.-JsonFile typescript/NodeFlags))

(def block-scoped (.-BlockScoped typescript/NodeFlags))

(def constant (.-Constant typescript/NodeFlags))

(def reachability-check-flags (.-ReachabilityCheckFlags typescript/NodeFlags))

(def reachability-and-emit-flags (.-ReachabilityAndEmitFlags typescript/NodeFlags))

(def context-flags (.-ContextFlags typescript/NodeFlags))

(def type-excludes-flags (.-TypeExcludesFlags typescript/NodeFlags))
