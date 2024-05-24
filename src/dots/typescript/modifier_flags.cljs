(ns dots.typescript.modifier-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/ModifierFlags))

(def public (.-Public typescript/ModifierFlags))

(def private (.-Private typescript/ModifierFlags))

(def protected (.-Protected typescript/ModifierFlags))

(def readonly (.-Readonly typescript/ModifierFlags))

(def override (.-Override typescript/ModifierFlags))

(def export (.-Export typescript/ModifierFlags))

(def abstract (.-Abstract typescript/ModifierFlags))

(def ambient (.-Ambient typescript/ModifierFlags))

(def static (.-Static typescript/ModifierFlags))

(def accessor (.-Accessor typescript/ModifierFlags))

(def async (.-Async typescript/ModifierFlags))

(def default (.-Default typescript/ModifierFlags))

(def const (.-Const typescript/ModifierFlags))

(def in (.-In typescript/ModifierFlags))

(def out (.-Out typescript/ModifierFlags))

(def decorator (.-Decorator typescript/ModifierFlags))

(def deprecated (.-Deprecated typescript/ModifierFlags))

(def has-computed-js-doc-modifiers (.-HasComputedJSDocModifiers typescript/ModifierFlags))

(def has-computed-flags (.-HasComputedFlags typescript/ModifierFlags))

(def accessibility-modifier (.-AccessibilityModifier typescript/ModifierFlags))

(def parameter-property-modifier (.-ParameterPropertyModifier typescript/ModifierFlags))

(def non-public-accessibility-modifier (.-NonPublicAccessibilityModifier typescript/ModifierFlags))

(def type-script-modifier (.-TypeScriptModifier typescript/ModifierFlags))

(def export-default (.-ExportDefault typescript/ModifierFlags))

(def all (.-All typescript/ModifierFlags))

(def modifier (.-Modifier typescript/ModifierFlags))
