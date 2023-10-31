(ns dots.typescript.refactor-action-info
  "Represents a single refactoring action - for example, the \"Extract Method...\" refactor might
   offer several actions, each corresponding to a surround class or closure to extract into."
  (:refer-clojure :exclude [name]))

(defn name
  "The programmatic name of the refactoring action"
  ^js [refactor-action-info]
  (.-name ^js refactor-action-info))

(defn set-name!
  "The programmatic name of the refactoring action"
  ^js [refactor-action-info value]
  (set! (.-name ^js refactor-action-info) value))

(defn description
  "A description of this refactoring action to show to the user.
   If the parent refactoring is inlined away, this will be the only text shown,
   so this description should make sense by itself if the parent is inlineable=true"
  ^js [refactor-action-info]
  (.-description ^js refactor-action-info))

(defn set-description!
  "A description of this refactoring action to show to the user.
   If the parent refactoring is inlined away, this will be the only text shown,
   so this description should make sense by itself if the parent is inlineable=true"
  ^js [refactor-action-info value]
  (set! (.-description ^js refactor-action-info) value))

(defn not-applicable-reason
  "A message to show to the user if the refactoring cannot be applied in
   the current context."
  ^js [refactor-action-info]
  (.-notApplicableReason ^js refactor-action-info))

(defn set-not-applicable-reason!
  "A message to show to the user if the refactoring cannot be applied in
   the current context."
  ^js [refactor-action-info value]
  (set! (.-notApplicableReason ^js refactor-action-info) value))

(defn kind
  "The hierarchical dotted name of the refactor action."
  ^js [refactor-action-info]
  (.-kind ^js refactor-action-info))

(defn set-kind!
  "The hierarchical dotted name of the refactor action."
  ^js [refactor-action-info value]
  (set! (.-kind ^js refactor-action-info) value))

(defn interactive?
  "Indicates that the action requires additional arguments to be passed
   when calling `getEditsForRefactor`."
  ^js [refactor-action-info]
  (.-isInteractive ^js refactor-action-info))

(defn set-is-interactive!
  "Indicates that the action requires additional arguments to be passed
   when calling `getEditsForRefactor`."
  ^js [refactor-action-info value]
  (set! (.-isInteractive ^js refactor-action-info) value))
