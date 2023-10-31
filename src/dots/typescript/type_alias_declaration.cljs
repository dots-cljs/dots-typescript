(ns dots.typescript.type-alias-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [type-alias-declaration]
  (.-kind ^js type-alias-declaration))

(defn modifiers
  ^js [type-alias-declaration]
  (.-modifiers ^js type-alias-declaration))

(defn name
  ^js [type-alias-declaration]
  (.-name ^js type-alias-declaration))

(defn type-parameters
  ^js [type-alias-declaration]
  (.-typeParameters ^js type-alias-declaration))

(defn type
  ^js [type-alias-declaration]
  (.-type ^js type-alias-declaration))

(defn flags
  ^js [type-alias-declaration]
  (.-flags ^js type-alias-declaration))

(defn parent
  ^js [type-alias-declaration]
  (.-parent ^js type-alias-declaration))

(defn source-file
  ^js [type-alias-declaration]
  (.getSourceFile ^js type-alias-declaration))

(defn child-count
  (^js [type-alias-declaration]
   (.getChildCount ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getChildCount ^js type-alias-declaration source-file)))

(defn child-at
  (^js [type-alias-declaration index]
   (.getChildAt ^js type-alias-declaration index))
  (^js [type-alias-declaration index source-file]
   (.getChildAt ^js type-alias-declaration index source-file)))

(defn children
  (^js [type-alias-declaration]
   (.getChildren ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getChildren ^js type-alias-declaration source-file)))

(defn start
  (^js [type-alias-declaration]
   (.getStart ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getStart ^js type-alias-declaration source-file))
  (^js [type-alias-declaration source-file include-js-doc-comment?]
   (.getStart ^js type-alias-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-alias-declaration]
  (.getFullStart ^js type-alias-declaration))

(defn get-end
  ^js [type-alias-declaration]
  (.getEnd ^js type-alias-declaration))

(defn width
  (^js [type-alias-declaration]
   (.getWidth ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getWidth ^js type-alias-declaration source-file)))

(defn full-width
  ^js [type-alias-declaration]
  (.getFullWidth ^js type-alias-declaration))

(defn leading-trivia-width
  (^js [type-alias-declaration]
   (.getLeadingTriviaWidth ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getLeadingTriviaWidth ^js type-alias-declaration source-file)))

(defn full-text
  (^js [type-alias-declaration]
   (.getFullText ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getFullText ^js type-alias-declaration source-file)))

(defn text
  (^js [type-alias-declaration]
   (.getText ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getText ^js type-alias-declaration source-file)))

(defn first-token
  (^js [type-alias-declaration]
   (.getFirstToken ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getFirstToken ^js type-alias-declaration source-file)))

(defn last-token
  (^js [type-alias-declaration]
   (.getLastToken ^js type-alias-declaration))
  (^js [type-alias-declaration source-file]
   (.getLastToken ^js type-alias-declaration source-file)))

(defn for-each-child
  (^js [type-alias-declaration cb-node]
   (.forEachChild ^js type-alias-declaration cb-node))
  (^js [type-alias-declaration cb-node cb-node-array]
   (.forEachChild ^js type-alias-declaration cb-node cb-node-array)))

(defn decorators
  ^js [type-alias-declaration]
  (.-decorators ^js type-alias-declaration))

(defn pos
  ^js [type-alias-declaration]
  (.-pos ^js type-alias-declaration))

(defn end
  ^js [type-alias-declaration]
  (.-end ^js type-alias-declaration))
