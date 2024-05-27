(ns dots.typescript.navigation-tree
  "Node in a tree of nested declarations in a file.
   The top node is always a script or module node.")

(defn text
  "Name of the declaration, or a short description, e.g. \"<class>\".
   
   **Returns:** `string`"
  ^js [navigation-tree]
  (.-text ^js navigation-tree))

(defn set-text!
  "Name of the declaration, or a short description, e.g. \"<class>\"."
  ^js [navigation-tree value]
  (set! (.-text ^js navigation-tree) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [navigation-tree]
  (.-kind ^js navigation-tree))

(defn set-kind!
  ^js [navigation-tree value]
  (set! (.-kind ^js navigation-tree) value))

(defn kind-modifiers
  "ScriptElementKindModifier separated by commas, e.g. \"public,abstract\"
   
   **Returns:** `string`"
  ^js [navigation-tree]
  (.-kindModifiers ^js navigation-tree))

(defn set-kind-modifiers!
  "ScriptElementKindModifier separated by commas, e.g. \"public,abstract\""
  ^js [navigation-tree value]
  (set! (.-kindModifiers ^js navigation-tree) value))

(defn spans
  "Spans of the nodes that generated this declaration.
   There will be more than one if this is the result of merging.
   
   **Returns:** `TextSpan[]`"
  ^js [navigation-tree]
  (.-spans ^js navigation-tree))

(defn set-spans!
  "Spans of the nodes that generated this declaration.
   There will be more than one if this is the result of merging."
  ^js [navigation-tree value]
  (set! (.-spans ^js navigation-tree) value))

(defn name-span
  "**Returns:** `TextSpan | undefined`"
  ^js [navigation-tree]
  (.-nameSpan ^js navigation-tree))

(defn set-name-span!
  ^js [navigation-tree value]
  (set! (.-nameSpan ^js navigation-tree) value))

(defn child-items
  "Present if non-empty
   
   **Returns:** `NavigationTree[] | undefined`"
  ^js [navigation-tree]
  (.-childItems ^js navigation-tree))

(defn set-child-items!
  "Present if non-empty"
  ^js [navigation-tree value]
  (set! (.-childItems ^js navigation-tree) value))
