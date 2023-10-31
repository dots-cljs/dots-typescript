(ns dots.typescript.transient-identifier)

(defn resolved-symbol
  ^js [transient-identifier]
  (.-resolvedSymbol ^js transient-identifier))

(defn set-resolved-symbol!
  ^js [transient-identifier value]
  (set! (.-resolvedSymbol ^js transient-identifier) value))

(defn kind
  ^js [transient-identifier]
  (.-kind ^js transient-identifier))

(defn escaped-text
  "Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
   Text of identifier, but if the identifier begins with two underscores, this will begin with three."
  ^js [transient-identifier]
  (.-escapedText ^js transient-identifier))

(defn original-keyword-kind
  ^js [transient-identifier]
  (.-originalKeywordKind ^js transient-identifier))

(defn in-js-doc-namespace?
  ^js [transient-identifier]
  (.-isInJSDocNamespace ^js transient-identifier))

(defn set-is-in-js-doc-namespace!
  ^js [transient-identifier value]
  (set! (.-isInJSDocNamespace ^js transient-identifier) value))

(defn text
  ^js [transient-identifier]
  (.-text ^js transient-identifier))

(defn flags
  ^js [transient-identifier]
  (.-flags ^js transient-identifier))

(defn parent
  ^js [transient-identifier]
  (.-parent ^js transient-identifier))

(defn source-file
  ^js [transient-identifier]
  (.getSourceFile ^js transient-identifier))

(defn child-count
  (^js [transient-identifier]
   (.getChildCount ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getChildCount ^js transient-identifier source-file)))

(defn child-at
  (^js [transient-identifier index]
   (.getChildAt ^js transient-identifier index))
  (^js [transient-identifier index source-file]
   (.getChildAt ^js transient-identifier index source-file)))

(defn children
  (^js [transient-identifier]
   (.getChildren ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getChildren ^js transient-identifier source-file)))

(defn start
  (^js [transient-identifier]
   (.getStart ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getStart ^js transient-identifier source-file))
  (^js [transient-identifier source-file include-js-doc-comment?]
   (.getStart ^js transient-identifier source-file include-js-doc-comment?)))

(defn full-start
  ^js [transient-identifier]
  (.getFullStart ^js transient-identifier))

(defn get-end
  ^js [transient-identifier]
  (.getEnd ^js transient-identifier))

(defn width
  (^js [transient-identifier]
   (.getWidth ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getWidth ^js transient-identifier source-file)))

(defn full-width
  ^js [transient-identifier]
  (.getFullWidth ^js transient-identifier))

(defn leading-trivia-width
  (^js [transient-identifier]
   (.getLeadingTriviaWidth ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getLeadingTriviaWidth ^js transient-identifier source-file)))

(defn full-text
  (^js [transient-identifier]
   (.getFullText ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getFullText ^js transient-identifier source-file)))

(defn get-text
  (^js [transient-identifier]
   (.getText ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getText ^js transient-identifier source-file)))

(defn first-token
  (^js [transient-identifier]
   (.getFirstToken ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getFirstToken ^js transient-identifier source-file)))

(defn last-token
  (^js [transient-identifier]
   (.getLastToken ^js transient-identifier))
  (^js [transient-identifier source-file]
   (.getLastToken ^js transient-identifier source-file)))

(defn for-each-child
  (^js [transient-identifier cb-node]
   (.forEachChild ^js transient-identifier cb-node))
  (^js [transient-identifier cb-node cb-node-array]
   (.forEachChild ^js transient-identifier cb-node cb-node-array)))

(defn decorators
  ^js [transient-identifier]
  (.-decorators ^js transient-identifier))

(defn modifiers
  ^js [transient-identifier]
  (.-modifiers ^js transient-identifier))

(defn pos
  ^js [transient-identifier]
  (.-pos ^js transient-identifier))

(defn end
  ^js [transient-identifier]
  (.-end ^js transient-identifier))
